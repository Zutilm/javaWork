public class WorkSix{
	public static void main(String[]args){
		for(int x=1;x<370;x++){
			if((x-10)+(x+20)+(x/2)+(x*2)==370){
				System.out.println("甲加工的零件数为:"+(x-10));
				System.out.println("乙加工的零件数为:"+(x+20));
				System.out.println("丙加工的零件数为:"+(x/2));
				System.out.println("丁加工的零件数为:"+(x*2));
			}
		}
	}
}