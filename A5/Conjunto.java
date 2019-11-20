package A5;

import java.util.Arrays;

public class Conjunto {
	private int num[];
	
	public Conjunto() {
		super();
		this.num = new int[100];
	}
	
	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	public void insert(int n) {
		
		boolean m = true;
		
		for(int k : num) {
			if(k == n) {
				m = false;
				break;
			}
		}
		
		if(m) {
			for(int k = 0; k < num.length; k++) {
				if(num[k] == 0) {
					num[k] = n;
					break;
				}
			}	
		}
		
		
	}
	
	public void remove(int n) {
		
		for(int k = 0; k < num.length; k++) {
			if(num[k] == n) {
				num[k] = 0;
			}
		}
	}
	
	public boolean contains(int n) {
		
		for(int k : num) {
			if(k == n) {
				return true;
			}
		}
		return false;
	}
	
	public void empty() {
		for(int k = 0; k < num.length; k++) {
			if(num[k] != 0) {
				num[k] = 0;
			}
		}
	}
	
	public int size() {
		int m = 0;
		
		for(int k : num) {
			if(k != 0) {
				m++;
			}
		}
		return m;
	}

	public Conjunto unir(Conjunto add){
		Conjunto c = new Conjunto();
		
		for(int k : num) {
			c.insert(k);
		}
		
		for(int k : add.getNum()) {
			c.insert(k);
		}
		
		return c;
	}
	
	public Conjunto interset(Conjunto add){
		Conjunto c = new Conjunto();
		
		int lista[] = new int[100];
		int p = 0;
		
		for(int k : num) {
			lista[p] = k;
			p++;
		}
		
		for(int k : add.getNum()) {
			for(int h = 0; h < lista.length; h++) {
				if(k == lista[h]){
					lista[h] = 0;
				}
				
			}
		}
		
		for(int k : num) {
			c.insert(k);
		}
		
		for(int k : lista) {
			c.remove(k);
		}
		
		return c;
	}
	
	public Conjunto subtrair(Conjunto add){
		Conjunto c = new Conjunto();
		
		for(int k : num) {
			c.insert(k);
		}
		
		for(int k : add.getNum()) {
			c.remove(k);
		}
		
		return c;
	}
	
	@Override
	public String toString() {
		int m = 0;
		
		for(int k = 0; k < num.length; k++) {
			if(num[k] != 0) {
				m++;
			}
		}
		
		int lista[] = new int[m];
		int p = 0;
		
		for(int k = 0; k < num.length; k++) {
			if(num[k] != 0) {
				lista[p] = num[k];
				p++;
			}
		}
		
		return Arrays.toString(lista);
	}

}
