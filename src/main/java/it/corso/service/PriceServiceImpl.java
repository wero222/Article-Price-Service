package it.corso.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.corso.dao.PriceDao;

@Service
public class PriceServiceImpl implements PriceService
{
	@Autowired
	private PriceDao priceDao;
	
	@Override
	public double getArticlePrice(String code)
	{
		return priceDao.getPriceByArtCode(code);
	}
}