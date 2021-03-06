/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.gft.customer.api;

import com.gft.customer.model.CustomersData;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-22T09:25:52.270-05:00")

@Api(value = "default", description = "the default API")
public interface DefaultApi {

    @ApiOperation(value = "Lookup a list of customers according to the apply filter.", nickname = "rootGet", notes = "", response = CustomersData.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CustomersData.class),
        @ApiResponse(code = 404, message = "customer not found."),
        @ApiResponse(code = 500, message = "Unexpected error.") })
    @RequestMapping(value = "/",
        produces = { "text/plain; charset=utf-8" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<CustomersData> rootGet(@ApiParam(value = "Mime type request expected" ,required=true) @RequestHeader(value="accept", required=true) String accept,@ApiParam(value = "Language expected" ,required=true) @RequestHeader(value="accept-language", required=true) String acceptLanguage,@ApiParam(value = "Mime type request expected" ,required=true) @RequestHeader(value="content-type", required=true) String contentType,@ApiParam(value = "IBM client ID" ,required=true) @RequestHeader(value="x-ibm-client-id", required=true) String xIbmClientId,@ApiParam(value = "Token authorization" ,required=true) @RequestHeader(value="authorization", required=true) String authorization,@ApiParam(value = "Santander global ID" ,required=true) @RequestHeader(value="x-santander-global-id", required=true) String xSantanderGlobalId,@ApiParam(value = "Customer ID") @Valid @RequestParam(value = "customer_id", required = false) String customerId,@ApiParam(value = "Document number") @Valid @RequestParam(value = "document_number", required = false) String documentNumber,@ApiParam(value = "Company name") @Valid @RequestParam(value = "company_name", required = false) String companyName,@ApiParam(value = "Company name") @Valid @RequestParam(value = "account_number", required = false) String accountNumber,@ApiParam(value = "Name") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "Paternal Name") @Valid @RequestParam(value = "paternal_name", required = false) String paternalName,@ApiParam(value = "Maternal Name") @Valid @RequestParam(value = "maternal_name", required = false) String maternalName);

}
