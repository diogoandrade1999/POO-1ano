package A9;

import java.util.*;

public class CollectionTester {

	public static void main(String[] args) {
		final int[] DIM = new int[]{1000, 5000, 10000, 20000, 40000, 100000};
		System.out.printf("%1$-10s %2$8s %3$8s %4$8s %5$8s %6$8s %7$8s \n", "Collection", 1000, 5000, 10000, 20000, 40000, 100000);
		Collection<Integer> col,col2,col3,col4;
		System.out.println("ArrayList");
		col = new ArrayList<Integer>();
		checkPerformance(col, DIM);
		System.out.println("LinkedList");
		col2 = new LinkedList<Integer>();
		checkPerformance(col2, DIM);
		System.out.println("Stack");
		col3 = new Stack<Integer>();
		checkPerformance(col3, DIM);
		System.out.println("TreeSet");
		col4 = new TreeSet<Integer>();
		checkPerformance(col4,DIM);
		
		
		}
		private static void checkPerformance(Collection<Integer> col, int[] DIMarray) {
		Iterator<Integer> iterator;
		double start, stop, delta;
		// Add
		System.out.printf("%1$-10s","add");
		for(int c=0; c<DIMarray.length; c++) {
		int DIM = c;
		start = System.nanoTime(); // clock snapshot before
		for(int i=0; i<DIM; i++ )
		col.add( i );
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop-start)/1e6; // convert to milliseconds
		// System.out.println(col.size()+ ": Add to " + col.getClass().getSimpleName() +" took " + delta + "ms");
		System.out.printf("%1$8.1g ", delta);
		}
		System.out.print("\n");
		// Search
		System.out.printf("%1$-10s","search");
		for(int c=0; c<DIMarray.length; c++) {
		int DIM = c;
		start = System.nanoTime(); // clock snapshot before
		for(int i=0; i<DIM; i++ ) {
		int n = (int) (Math.random()*DIM);
		if (!col.contains(n))
		System.out.println("Not found???"+n);
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
		// System.out.println(col.size()+ ": Search to " + col.getClass().getSimpleName() +" took " + delta + "ms");
		System.out.printf("%1$8.1g ", delta);
		}
		System.out.print("\n");
		// Remove
		System.out.printf("%1$-10s","remove");
		for(int c=0; c<DIMarray.length; c++) {
		start = System.nanoTime(); // clock snapshot before
		iterator = col.iterator();
		while (iterator.hasNext()) {
		 iterator.next();
		 iterator.remove();
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
		//System.out.println(col.size() + ": Remove from "+ col.getClass().getSimpleName() +" took " + delta + "ms" + "\n");
		System.out.printf("%1$8.1g ", delta);
		}
		System.out.print("\n");
		}
}
