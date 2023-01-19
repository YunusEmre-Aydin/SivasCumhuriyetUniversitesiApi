package com.sivascumhuriyetuniversiteapi.yoa.SivasCumhuriyetUniversitesiApi;

import java.util.*;

import org.springframework.web.bind.annotation.*;

// http://localhost:8080/ders/listele

@RestController
@RequestMapping("/ders")
public class DersRestApi {

	public static final List<String> DERSLER = new ArrayList<>();
	{
		DERSLER.add("Matematik");
		DERSLER.add("Fizik");
		DERSLER.add("Biyoloji");
		
		
	}
	@GetMapping("/")  //listele
	public List<String> listele(){
		
		return DERSLER;
		
	}
	
	
	@PostMapping("/")  //ekle
	public boolean ekle(@RequestBody String dersAd) {
		DERSLER.add(dersAd);
		return true;
	}
	
	@DeleteMapping("/") // sil
	public boolean sil(@RequestBody String dersAd) {
		DERSLER.remove(dersAd);
		return true;
	}
	
}
