package it.corso.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.corso.service.PriceService;

@RestController
@RequestMapping("/api/price")
public class PriceController
{
	@Autowired
	private PriceService priceService;
	
	// endpoint unico: ritorna prezzo articolo per codice  localhost:8052/api/price/get/{article code}
	@GetMapping("/get/{code}")
	public double getArticlePrice(@PathVariable("code") String code)
	{
		return priceService.getArticlePrice(code);
	}
}