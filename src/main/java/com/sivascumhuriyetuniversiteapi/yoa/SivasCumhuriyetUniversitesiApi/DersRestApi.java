package com.sivascumhuriyetuniversiteapi.yoa.SivasCumhuriyetUniversitesiApi;

import java.util.*;

import org.springframework.web.bind.annotation.*;

// http://localhost:8080/ders/listele

@RestController
@RequestMapping("/ders")
public class DersRestApi {

	private static final List<String> DERSLER = new ArrayList<>();
	{
		DERSLER.add("Matematik");
		DERSLER.add("Fizik");
		DERSLER.add("Biyoloji");
		
		int silinenDers = 1;
		DERSLER.remove(silinenDers);
		
		int eklenenDers = 2;
		DERSLER.remove(eklenenDers);
		
	}
	@GetMapping("/")  //listele
	public List<String> DersleriListele(){
		
		return DERSLER;
		
	}
	
	
	@PostMapping("/")  //ekle
	public String DersEkle(@RequestBody String eklenenDers) {
		DERSLER.add(eklenenDers);
		int eklenenders = 1;
		return null;
	}
	
	@PostMapping("/") // sil
	public String DersSil(@RequestBody int silinenDers) {
		DERSLER.remove(silinenDers);
		
		return null;
	}
	
}
