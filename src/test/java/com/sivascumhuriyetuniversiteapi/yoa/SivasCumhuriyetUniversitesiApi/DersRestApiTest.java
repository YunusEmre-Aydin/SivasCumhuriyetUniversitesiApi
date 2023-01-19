package com.sivascumhuriyetuniversiteapi.yoa.SivasCumhuriyetUniversitesiApi;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;





public class DersRestApiTest {

	@Test
	public void testListele() {

	
		List<String> DERSLER = new ArrayList<>();
		String sonuc = ("Matematik");
		assertEquals("Matematik", DERSLER);
		return;
	}

	@Test
	public void testEkle() {
		List<String> DERSLER = new ArrayList<>();
		DERSLER.add("Cografya");
	

		String sonuc = ("Cografya");
		assertEquals("Cografya", sonuc);
	}

	@Test
	public void testSil() {
		List<String> DERSLER = new ArrayList<>();
		DERSLER.remove("Cografya");
		boolean sonuc = DERSLER.remove("Cografya");;
		assertEquals("Cografya", sonuc);
	}

}
