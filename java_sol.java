import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
//		int t=in.nextInt();
		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt(), m=in.nextInt(), r=in.nextInt();
			int mn=Integer.MAX_VALUE;
			for(int i=0; i<n; ++i) {
				int a=in.nextInt();
				mn=Math.min(mn, a);
			}
			int mx=0;
			for(int i=0; i<m; ++i) {
				int a=in.nextInt();
				mx=Math.max(mx, a);
			}
			int tmp=r;
			r-=((tmp/mn)*mn);
			mx*=(tmp/mn);
			out.println(Math.max(r+mx, tmp));
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
