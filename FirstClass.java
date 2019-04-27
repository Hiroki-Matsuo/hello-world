import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FirstClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int yearBirth = s.nextInt();
		int twelve = yearBirth % 12;
		System.out.println(twelve);

		//ファイルのパスを指定する
		try{
			File fileEto = new File("/Users/hmatsuo/etoeto1.txt");

			//ファイルが存在しない場合に例外が発生するため、確認。
			if(!fileEto.exists()) {
			System.out.println("ファイルが存在しません。");
			return;
		}
		//FileReaderクラスとreadメソッドを使って１文字ずつ読み込む
		FileReader fileReader = new FileReader(fileEto);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String data;
		while((data = bufferedReader.readLine()) != null) {
			System.out.println(data);
		}
		}catch(IOException e){
			e.printStackTrace();
		}
		{

		}
	}
}
