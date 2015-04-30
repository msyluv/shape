package sds.icto55.oop.example;


public class Ex3_overloadingTest {

	public static void main(String[] args) {
		Ex3_overloading s = new Ex3_overloading();
		
		s.setTitle("좋은날");
		s.setArtist("아이유");
		s.setAlbum("Real");
		s.setComposer("이민수");
		s.setTrack(3);
		s.setYear(2010);
		
		Ex3_overloading song = new Ex3_overloading("좋은날","아이유","Real","이민수",2010,3);
		Ex3_overloading song2 = new Ex3_overloading( "러빙유", "씨스타", "", null, 0, 0 );
		Ex3_overloading song3 = new Ex3_overloading( "여수 밤바다", "버스커 버스커", "", null, 0, 0 ); 
		Ex3_overloading song4 = new Ex3_overloading( "Like This", "원더걸스" );  

		s.show();
		song.show();
		song2.show();
		song3.show();
		song4.show();
	}
}
