#incldue<bits/stdc++.h>
using namespace std;

int n, x,i;
int a[1000020];
int p[1000020];
int f[1000020];

int main(){
    if ( !(cin >> n)) return 0;

    for(i = 0; i<n;i++){
        cin >> x;
        p[x] = i;
    }
    for(i =0;i<n;i++){
        if(scanf("%d",&x) != EOF){
            a[i] = p[x];
        }
    }
    fill(f , f+n, 2000000);

    for(int i =0;i<n;i++){
        *lower_bound ( f , f+n , a[i]) = a[i];
    }
    int result = lower_bound( f, f+n , 2000000) - f;
    printf("%d\n", results)
}