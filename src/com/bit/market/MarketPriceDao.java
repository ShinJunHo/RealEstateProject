package com.bit.market;

public interface MarketPriceDao {
	public void getSelectedPlacePrice(int index);
	//MarketPrice mp
	public void updateMarketPrice();
	public void deleteMarketPrice();
}
