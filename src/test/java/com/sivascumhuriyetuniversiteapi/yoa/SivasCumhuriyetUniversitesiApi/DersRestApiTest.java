package com.sivascumhuriyetuniversiteapi.yoa.SivasCumhuriyetUniversitesiApi;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;





public class DersRestApiTest {

	@Test
	public void testListele() {

	
		List<String> DERSLER = new ArrayList<>();
		System.out.println(DERSLER);	
		return;
	}

	@Test
	public void testEkle() {
		List<String> DERSLER = new ArrayList<>();
		String ders ="Matematik";

		DersRestApi ekle = new DersRestApi();	
		String eklenenDers = ekle.DersEkle(ders);
		DERSLER.add(eklenenDers);
	}

	@Test
	public void testSil() {
		List<String> DERSLER = new ArrayList<>();
	int silinenDers = 1;
	
	
	DersRestApi sil = new DersRestApi();
	String dersisil = sil.DersSil(1);

	}

}
