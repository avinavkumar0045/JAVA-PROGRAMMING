// #include<bits/stdc++>
#include<iostream>
using namespace std;

int sumSquare(int y){
    int res=0;
    int i,j;
    for(i=0;i<= sqrt(y);i++){
        for( j =0;j<=i;j++){
            if( i*i + j*j == y){
                res++;
            }
        }
    }
    return res;
}
int main(){
    int t;
    cin >>t;
    int i=1;
    while( t--){
        int n;
        cin >>n;
        cout<<"Line #"<<i<<": "<<sumSquare(n)<<endl;
        i++;
    }
    return 0;
}