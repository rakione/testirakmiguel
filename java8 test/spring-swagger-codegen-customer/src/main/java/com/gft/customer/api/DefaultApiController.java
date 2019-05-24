package com.gft.customer.api;

import com.gft.customer.model.CustomersData;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-22T09:25:52.270-05:00")

@Controller
public class DefaultApiController implements DefaultApi {

    private static final Logger log = LoggerFactory.getLogger(DefaultApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DefaultApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CustomersData> rootGet(@ApiParam(value = "Mime type request expected" ,required=true) @RequestHeader(value="accept", required=true) String accept,@ApiParam(value = "Language expected" ,required=true) @RequestHeader(value="accept-language", required=true) String acceptLanguage,@ApiParam(value = "Mime type request expected" ,required=true) @RequestHeader(value="content-type", required=true) String contentType,@ApiParam(value = "IBM client ID" ,required=true) @RequestHeader(value="x-ibm-client-id", required=true) String xIbmClientId,@ApiParam(value = "Token authorization" ,required=true) @RequestHeader(value="authorization", required=true) String authorization,@ApiParam(value = "Santander global ID" ,required=true) @RequestHeader(value="x-santander-global-id", required=true) String xSantanderGlobalId,@ApiParam(value = "Customer ID") @Valid @RequestParam(value = "customer_id", required = false) String customerId,@ApiParam(value = "Document number") @Valid @RequestParam(value = "document_number", required = false) String documentNumber,@ApiParam(value = "Company name") @Valid @RequestParam(value = "company_name", required = false) String companyName,@ApiParam(value = "Company name") @Valid @RequestParam(value = "account_number", required = false) String accountNumber,@ApiParam(value = "Name") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "Paternal Name") @Valid @RequestParam(value = "paternal_name", required = false) String paternalName,@ApiParam(value = "Maternal Name") @Valid @RequestParam(value = "maternal_name", required = false) String maternalName) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CustomersData>(objectMapper.readValue("\"\"", CustomersData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CustomersData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CustomersData>(HttpStatus.NOT_IMPLEMENTED);
    }

}
