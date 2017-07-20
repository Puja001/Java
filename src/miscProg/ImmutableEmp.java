package miscProg;

final class ImmutableEmp {
	
		final String name;
		final int id;
		final int salary;
		
		public ImmutableEmp(String name,int id ,int salary){
		 this.name=name;
		 this.id=id;
		 this.salary= salary;
		}
		
	public static void main(String[] args) {
		ImmutableEmp ie = new ImmutableEmp("Puja", 1, 100000);
		System.out.println("name:" + ie.name);
		System.out.println("name:" + ie.id);
		System.out.println("name:" + ie.salary);
				
	}

}
