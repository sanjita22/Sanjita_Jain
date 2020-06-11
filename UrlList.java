import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;


public class UrlList implements Iterable<String> {
	private LinkedList<String> urlLib = new LinkedList<String>();
	private class UrlIterator implements Iterator<String>{
		private int index = 0;
		@Override
		public boolean hasNext() {
			return index < urlLib.size();
		}

		@Override
		public String next() {
			StringBuilder sb = new StringBuilder();
			try{
			URL url = new URL (urlLib.get(index));
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = null;
			while( (line = br.readLine())!= null){
				sb.append(line);
				sb.append("\n");
			}
			br.close();
			} 
			catch(Exception e){
			}
			index++;
			return sb.toString();
		}
		public void remove(){
			urlLib.remove(index);
		}
	}
	
	public UrlList(){
	urlLib.add("http://caveofprogramming.com");
	urlLib.add("http://intranet.attra.com.au");
	}
	
	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Iterator<String> iterator() {
		return new UrlIterator();
		
	
	}
	
	
	

}
