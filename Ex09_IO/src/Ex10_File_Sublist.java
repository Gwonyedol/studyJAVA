import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_Sublist {
	static int totalFiles=0; //��ü�� ���� �ڿ�  �ƴϰ� static ����
	static int totaldirs=0;
	
	public static void main(String[] args) {
		
	
		
		if(args.length != 1) {
			System.out.println("����: java [���ϸ�] [��θ�]");
			System.out.println("����  : java Ex10_File_Sublist C:\\Temp");
			System.exit(0); //���μ��� ����
		}
		
		File f = new File(args[0]); //args[0]  > C:\\Temp
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮");
			System.exit(0);
		}
		//�� ���� (������� �ǴܵǴ� ����)
		printFileList(f);
		System.out.println("�� ���ϼ� :" + totalFiles);
		System.out.println("�� ������ :" + totaldirs);
	}
	
	static void printFileList(File dir) {
		System.out.println("[Full Path : " + dir.getAbsolutePath() + "]");
		
		//���� 1 Collection ��� ����
		List<Integer> subDir = new ArrayList<Integer>();
		
		File[] files = dir.listFiles(); //C:Temp �Է��ߴٸ� ���� �ڿ��� �迭��...
		
		//C:\\Temp   [0] a.txt
		//           [1] NEW
		//           [2] c.jpg  �̷� ������ File[] ��Ƽ� ����
		//           [3] OLD
		for(int i = 0 ; i < files.length ; i++) {
			String filename = files[i].getName(); //������ , ���ϸ�
			if(files[i].isDirectory()) {
				filename = "<DIR> [" + filename + "]";
				//POINT ����2 (add) �ǹ�
				subDir.add(i);
				//add 1
				//add 3
				
				//[0] > 1 (NEW)
				//[1] > 3 (OLD)
			}else {
				filename = filename +" / " + files[i].length() + "Byte";
			}
			System.out.println("  " + filename);
		}
		
		//����
		int dirnum = subDir.size();
		int filenum = files.length - dirnum;
		
		//������
		totaldirs+= dirnum; //���� ���� ����
		totalFiles+=filenum; //���� ���� ����
		
		System.out.println("[Current dirnum] :" + dirnum);
		System.out.println("[Current filenum] :" + filenum);
		System.out.println("*******************************");
		
		//���� for ���ؼ�
		for(int j = 0 ; j < subDir.size(); j++) {
			int index = subDir.get(j);
			printFileList(files[index]); //���ȣ��
		}
		
	}

}









