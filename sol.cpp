#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int n, m, r;
	cin >> n >> m >> r;
	int s[n], b[m];
	for(int i=0; i<n; ++i)
		cin >> s[i];
	for(int i=0; i<m; ++i)
		cin >> b[i];
	//greedy solution:
	//get the min price of shares to buy
	int mn=*min_element(s, s+n);
	//get the max price of the shares to sell
	int mx=*max_element(b, b+m);
	//store the original 'bourles' that you have to compare later
	int tmp=r;
	//subtract the current 'bourles' that you have from the shares that you've bought
	r-=((tmp/mn)*mn);
	//get the max number of shares that you can sell from the shares that you've bought
	mx*=(tmp/mn);
	//checkk if you keep the profit or not do anything
	cout << max(r+mx, tmp) << "\n";
}
