package com.cts.assignment.model;



public class TheLogConverter {
	
	
	 public static CategoryLog categoryLogConverter(Category category){
	        CategoryLog categoryLog=new CategoryLog();
	        categoryLog.setCategoryId(category.getCategoryId());
	        categoryLog.setCategoryName(category.getCategoryName());
	        categoryLog.setCreatedDateTime(category.getCreatedDateTime());
	        categoryLog.setCreatedUser(category.getCreatedUser());
	        categoryLog.setLastModifiedDateTime(category.getLastChangeDateTime());
	        categoryLog.setLastModifiedUser(category.getLastModifiedUser());
	        categoryLog.setVersion(category.getVersion());
	        return categoryLog;
	    }
	 
	 public static StockLog stockLogConverter(Stock stock){
	        StockLog stockLog=new StockLog();
	        stockLog.setRefrenceId(stock.getRefrenceId());
	        stockLog.setCategoryId(stock.getCategory().getCategoryId());
	        stockLog.setCreatedDate(stock.getCreatedDate());
	        stockLog.setCreatedUser(stock.getCreatedUser());
	        stockLog.setDateStock(stock.getDateStock());
	        stockLog.setLastModifiedDate(stock.getLastchangedDate());
	        stockLog.setLastModifiedUser(stock.getLastChangedUser());
	        stockLog.setProductId(stock.getProduct().getProductId());
	        stockLog.setQuantity(stock.getQuantity());
	        stockLog.setSupplierId(stock.getSupplier().getSupplierId());
	        stockLog.setVersion(stock.getVersion());
	        return stockLog;
	    }
	 
	 public static SupplierLog supplierLogConverter(Supplier supplier){
	        SupplierLog supplierLog=new SupplierLog();
	        supplierLog.setSupplierId(supplier.getSupplierId());
	        supplierLog.setCreatedDate(supplier.getCreatedDate());
	        supplierLog.setCreatedUser(supplier.getCreatedUser());
	        supplierLog.setLastModifiedDate(supplier.getLastChangDate());
	        supplierLog.setLastModifiedUser(supplier.getLastModifiedUser());
	        supplierLog.setSupplierCompany(supplier.getSupplierCompany());
	        supplierLog.setSupplierContact(supplier.getSupplierContact());
	        supplierLog.setSupplierName(supplier.getSupplierName());
	        supplierLog.setVersion(supplier.getVersion());
	        return supplierLog;
	    }

	 public static pricingLog pricingLogLogConverter(Pricing pricing){
		 pricingLog pricingLog=new  pricingLog();
	        pricingLog.setPricingId(pricing.getPricingId());
	        pricingLog.setCreatedDate(pricing.getCreatedDate());
	        pricingLog.setCreatedUser(pricing.getCreatedUser());
	        pricingLog.setLastModifiedDate(pricing.getLastModifiedDate());
	        pricingLog.setLastModifiedUser(pricing.getLastModifiedUser());
	        pricingLog.setPricingDiscountPrecentage(pricing.getPricingDiscountPrecentage());
	        pricingLog.setPricingEffectiveDate(pricing.getPricingEffectiveDate());
	        pricingLog.setPricingExpireDate(pricing.getPricingExpireDate());
	        pricingLog.setPricingName(pricing.getPricingName());
	        pricingLog.setVersion(pricing.getVersion());
	        return pricingLog;
	    }

}
