#include<bits/stdc++.h>
using namespace std;

void makeheap(int x[] , int n){

}

void heapsort(int x[] , int n){

}

int main(){
    int T;
    cin>>T;
    while(T--){
        int n,B;
        cin >>n>>B;
        int a[n];

        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        sort(a , a+n);
        makeheap(a,n);
        heapsort(a,n);

        int count=0;
        int sum =0;

        for(int i=0;i<n;i++){
            if(sum + a[i] <= B){
                sum += a[i];
                count++;
            }else{
                break;
            }
        }
        cout<<count<<"\n";
    }
    return 0;
}