#include<iostream>
using namespace std;

#define N 1000
#define MOD 10056

int main(){
    int T,n,i,j,line =1;
    int count[N+1];
    cin>>T;

    count[0] = 1;
    count[1] = 1;

    for(int i=2;i<=N;i++){
        count[i] = 0;
        long long c=1;

        for(j=0;j<i;j++){
            count[i] = (count[i] + count[j]*c)%MOD;
            c = c*(i-j)/(j+1);
        }
    }
    while(T--){
        cin>>n;
        cout<<"Line "<<line++<<": "<<count[n]%MOD<<"\n";
    }
    return 0;
}