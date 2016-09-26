package chapter03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneList02 {

	public static void main(String[] args) {
		Scanner scanner = null;
		
		try{
		File file = new File("phone.txt");
		
		if( file.exists() == false ){
			System.out.println( "파일이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("*************** 파일정보 ***************");
		System.out.println(file.getAbsolutePath());
		System.out.println( file.length() + "Bytes" );
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println( sdf.format( new Date( file.lastModified() ) ));
		
		
		System.out.println("*************** 전화번호 리스트 ************");
		scanner = new Scanner( file );
		while( scanner.hasNextLine() ){
			String name = scanner.next();
//			String phone01 = scanner.next();
//			String phone02 = scanner.next();
//			String phone03 = scanner.next();
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int num3 = scanner.nextInt();
//			System.out.println(name+":"+phone01 + "-" + phone02 + "-" + phone03);
			System.out.println(name+":"+num1 + "-" + num2 + "-" + num3);
		}
		
		
		
		
		}catch( IOException ex ){
			System.out.println("error:" + ex);
		}finally{
			scanner.close();
		}


	}

}
