#include<iostream>
using namespace std;

int main(){
    int c;
    int t,h,s,i,j;
    int d;
    cin >> c;
    for(int i=0;i<c;i++){
        s=0;
        cin>>t>>h;
        d = sqrt(t);
        s+= t+(d*4);
        for(j=1;j<h;j++){
            s+=3;
            s+=(d+j)*4;
            if (( d+j) > 2){
                s += (d+j-2)*2;

            }
        }
        cout<<s<<" liters\n";
    }
    return 0;
}