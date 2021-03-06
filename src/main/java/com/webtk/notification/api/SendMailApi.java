/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.webtk.notification.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Api(value = "send-mail", description = "the send-mail API")
public interface SendMailApi {

    Logger log = LoggerFactory.getLogger(SendMailApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Creating messages with attachments", nickname = "createEmailWithAttachment", notes = "", tags = {"email_notification",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Mail send successfully"),
            @ApiResponse(code = 405, message = "Invalid input")})
    @RequestMapping(value = "/send-mail",
            produces = {"application/json"},
            consumes = {"multipart/form-data"},
            method = RequestMethod.POST)
    default ResponseEntity<Void> createEmailWithAttachment(@NotNull @ApiParam(value = "reciver email address", required = true) @Valid @RequestParam(value = "to", required = true) String to

            , @NotNull @ApiParam(value = "sender email address", required = true) @Valid @RequestParam(value = "from", required = true) String from

            , @NotNull @ApiParam(value = "Email subject line", required = true, defaultValue = "Default Subject") @Valid @RequestParam(value = "subject", required = true, defaultValue = "Default Subject") String subject

            , @ApiParam(value = "file detail") @Valid @RequestPart(name = "file", required = false) MultipartFile file

            , @ApiParam(value = "Body text of the email") @Valid @RequestParam(value = "bodyText", required = false) String bodyText

    ) {
        if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default SendMailApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
