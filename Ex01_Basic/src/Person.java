//���� �ּ�
//���赵 (�Ӽ� + ���)
public class Person {
   private int age;  //����� ���̸� ������ �ִ� (���� ������ ��� ����)
   private String name; //����� �̸��� ������ �ִ�
   
   
   public Person() { //�������Լ� (Ư���� �Լ�)
	   //��ü ������ ���ÿ� ȣ��Ǵ� �Լ� 
   }
   public Person(int age , String name) {
	   this.age = age;
	   this.name = name;
   }
   
   public void personInfo() {
	   System.out.println("����:" + this.name +","+ this.age);
   }
}