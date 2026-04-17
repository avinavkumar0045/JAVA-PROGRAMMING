#include<iostream>
using namespace std;
int lonelyinteger(int a_size , int a[]){
    int num=0;
    for(int i=0;i< a_size;i++){
        num = num^ a[i];
    }
    return num;
}
int main(){
    int res;
    int a_size;
    cin>>a_size;
    int a[a_size];
    for(int i=0;i<a_size;i++){
        cin>> a[i];
    }
    res = lonelyinteger(a_size , a);
    cout<< res;
    return 0;

}
void y(){
    cout<<"break";
}