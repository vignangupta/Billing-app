package com.onlineRetail.billing.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.onlineRetail.billing.Exception.InvalidTokenException;
import com.onlineRetail.billing.Exception.IdException;
import com.onlineRetail.billing.entity.ProductEntity;
import com.onlineRetail.billing.repository.ProductRepository;

@Controller
public class RestController {
	@Autowired
	private ProductRepository productRepository;
	
@GetMapping("/home") public String home(){
	return "home";
}

@GetMapping("/bill") public String billGenerator (@RequestParam(name="id") Integer id, @RequestParam(name="quantity") Integer quantity, Model model){
	try {
		if(	id>=1000&&id<=9999&&quantity>=0) {
			Optional<ProductEntity> product=productRepository.findById(id);
			if (!product.isPresent()) {
				throw new IdException(id);
			}
			model.addAttribute("quantity", quantity);
			model.addAttribute("name",product.get().getName());
			model.addAttribute("category",product.get().getCategory());
			model.addAttribute("description",product.get().getDescription());
			model.addAttribute("price",product.get().getPrice());
			model.addAttribute("totalPrice", product.get().getPrice()*quantity);
			return "finalBill";
			}
		else {
			throw new InvalidTokenException();
		}
	}
	catch(MethodArgumentTypeMismatchException e) {
		return "invaildToken";				
	}
	catch (InvalidTokenException e) {
		return "invaildToken";
	}
	catch (IdException e){
		return "idNotFound";
	}
}
}
