import com.entity.Product;
import com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:9090/findAllAccount 
	
	@RequestMapping(value = "findAllProduct",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProductDetails() {
		return productService.findAllProduct();
	}
	
	@RequestMapping(value = "findProductInfo/{prodid}",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Product findProductInfo(@PathVariable("prodid") int prodid) {
		return productService.findProductInfo(prodid);
	}
	
	
	// http://localhost:9090/createProduct
	// method post  	
	// {"prodid":3,"name":"Samsung S24 Ultra","desc":"Samsung AI phone 2024 16GB RAM, 528 GB storage quadcore processor","url":"https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcRCjyekLTGxFsl4qRLxSG1Z-mqNJWIzPgRkGKmbrbqdmOmpH6D2Rh8z-rRBfO2o1wfXa-uRmj_LDp0YsbFNCB6kCLfvZ3ts", "price":130000}	
			@RequestMapping(value = "createProduct",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	
	public String createProduct(@RequestBody Product product) {	
			System.out.println(product.getProduct_Id()+" "+product.getProduct_name()+" "+product.getProduct_desc()+" "+product.getProductImageUrl()+" "+product.getProduct_price());
			return productService.productCreate(product);
	}
	
	// http://localhost:9090/deleteProduct/1
	// http://localhost:9090/deleteProduct/100		

			
	@RequestMapping(value = "deleteProduct/{prodid}",method = RequestMethod.DELETE)
	public String deleteProduct(@PathVariable("prodid") int prodid) {
		return productService.deleteProduct(prodid);
	}		
	
}