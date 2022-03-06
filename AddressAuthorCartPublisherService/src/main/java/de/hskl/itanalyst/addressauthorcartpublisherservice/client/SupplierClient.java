package de.hskl.itanalyst.addressauthorcartpublisherservice.client;

import de.hskl.itanalyst.addressauthorcartpublisherservice.client.model.BookOrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "supplier", url = "http://localhost:8999")
public interface SupplierClient {
    @PostMapping("/orderBook")
    void orderBook(BookOrderDTO orderDTO);
}
