package test.animal;

import animal.*;

public class AnimalUnitTest{
	public static void main(String[] args){
		Animal a1 = new Cheetar(); 		// チーター
		Animal a2 = new Horse();		// 馬
		Animal a3 = new Lion();  		// ライオン
		
		// チーター							   ↓テスト結果
		System.out.println(a1.getSpeed());	// 110
		System.out.println(a1.getName());	// チーター
		System.out.println(a1.race(a1));	// draw
		System.out.println(a1.race(a2)); 	// チーター win
		System.out.println(a1.race(a3)); 	// チーター win
		
		// 馬
		System.out.println(a2.getSpeed());	// 80
		System.out.println(a2.getName());	// 馬
		System.out.println(a2.race(a1)); 	// 馬 lose
		System.out.println(a2.race(a2)); 	// draw
		System.out.println(a2.race(a3)); 	// 馬 win
		
		// Lion
		System.out.println(a3.getSpeed());	// 60
		System.out.println(a3.getName());	// ライオン
		System.out.println(a3.race(a1)); 	// ライオン lose
		System.out.println(a3.race(a2)); 	// ライオン lose
		System.out.println(a3.race(a3)); 	// draw
	}
}
