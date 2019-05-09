package com.webtk.notification.kafka;

import message.SendMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendEmailProducer {

  private final KafkaTemplate<String, SendMessage> kafka;

  @Value("${notification.kafka.sendmessage.topic}")
  private String topic;

  @Value("${notification.kafka.sendmessage.records}")
  private Integer numRecords;

  public SendEmailProducer(
      @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
          KafkaTemplate<String, SendMessage> kafka) {
    this.kafka = kafka;
  }

  public void produce() {
    String data =
        "aW1hZ2UgaWQgPSA4YTcwNDc2YjY5MzUzNGY2MDE2OTRkMDcxNjBmMDJlNAoKCmRvYyBpZCA9IDhhNzBhMmQxNjkzMTMzMWUwMTY5NGQwN2M3ZjkwMzc3CiAiZmlsZW5hbWUiOiAiZ2l0aHViLWdpdC1jaGVhdC1zaGVldC5wZGYiLAoKCgpERUxFVEUgRlJPTSBicnNfd2F2ZV9jb250ZW50X2hpc3Rvcnk7CkRFTEVURSBGUk9NIGJyc193YXZlX2NvbnRlbnQ7CkRFTEVURSBGUk9NIGJyc193YXZlX3N1bW1hcnlfaGlzdG9yeTsKREVMRVRFIEZST00gYnJzX3dhdmVfc3VtbWFyeTsKREVMRVRFIEZST00gYnJzX3JlcG9ydF93YXZlOwoKCjsKCmltYWdlIGlkID0gOGE3MDQ3NmI2OTM1MzRmNjAxNjk0ZDA3MTYwZjAyZTQKCgpkb2MgaWQgPSA4YTcwYTJkMTY5MzEzMzFlMDE2OTRkMDdjN2Y5MDM3NwogImZpbGVuYW1lIjogImdpdGh1Yi1naXQtY2hlYXQtc2hlZXQucGRmIiwKCgoKREVMRVRFIEZST00gYnJzX3dhdmVfY29udGVudF9oaXN0b3J5OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9jb250ZW50OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9zdW1tYXJ5X2hpc3Rvcnk7CkRFTEVURSBGUk9NIGJyc193YXZlX3N1bW1hcnk7CkRFTEVURSBGUk9NIGJyc19yZXBvcnRfd2F2ZTsKCgo7Cj09PT09PT09PT09PT0zCmltYWdlIGlkID0gOGE3MDQ3NmI2OTM1MzRmNjAxNjk0ZDA3MTYwZjAyZTQKCgpkb2MgaWQgPSA4YTcwYTJkMTY5MzEzMzFlMDE2OTRkMDdjN2Y5MDM3NwogImZpbGVuYW1lIjogImdpdGh1Yi1naXQtY2hlYXQtc2hlZXQucGRmIiwKCgoKREVMRVRFIEZST00gYnJzX3dhdmVfY29udGVudF9oaXN0b3J5OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9jb250ZW50OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9zdW1tYXJ5X2hpc3Rvcnk7CkRFTEVURSBGUk9NIGJyc193YXZlX3N1bW1hcnk7CkRFTEVURSBGUk9NIGJyc19yZXBvcnRfd2F2ZTsKCgo7Cj09PT09PT09PT09PSA0CmltYWdlIGlkID0gOGE3MDQ3NmI2OTM1MzRmNjAxNjk0ZDA3MTYwZjAyZTQKCgpkb2MgaWQgPSA4YTcwYTJkMTY5MzEzMzFlMDE2OTRkMDdjN2Y5MDM3NwogImZpbGVuYW1lIjogImdpdGh1Yi1naXQtY2hlYXQtc2hlZXQucGRmIiwKCgoKREVMRVRFIEZST00gYnJzX3dhdmVfY29udGVudF9oaXN0b3J5OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9jb250ZW50OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9zdW1tYXJ5X2hpc3Rvcnk7CkRFTEVURSBGUk9NIGJyc193YXZlX3N1bW1hcnk7CkRFTEVURSBGUk9NIGJyc19yZXBvcnRfd2F2ZTsKCgo7Cgo9PT09PT09PT09PT09PT09PT09PT09PT01IAppbWFnZSBpZCA9IDhhNzA0NzZiNjkzNTM0ZjYwMTY5NGQwNzE2MGYwMmU0CgoKZG9jIGlkID0gOGE3MGEyZDE2OTMxMzMxZTAxNjk0ZDA3YzdmOTAzNzcKICJmaWxlbmFtZSI6ICJnaXRodWItZ2l0LWNoZWF0LXNoZWV0LnBkZiIsCgoKCkRFTEVURSBGUk9NIGJyc193YXZlX2NvbnRlbnRfaGlzdG9yeTsKREVMRVRFIEZST00gYnJzX3dhdmVfY29udGVudDsKREVMRVRFIEZST00gYnJzX3dhdmVfc3VtbWFyeV9oaXN0b3J5OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9zdW1tYXJ5OwpERUxFVEUgRlJPTSBicnNfcmVwb3J0X3dhdmU7CgoKOwo9PT09PT09PT09PT09PSA2CmltYWdlIGlkID0gOGE3MDQ3NmI2OTM1MzRmNjAxNjk0ZDA3MTYwZjAyZTQKCgpkb2MgaWQgPSA4YTcwYTJkMTY5MzEzMzFlMDE2OTRkMDdjN2Y5MDM3NwogImZpbGVuYW1lIjogImdpdGh1Yi1naXQtY2hlYXQtc2hlZXQucGRmIiwKCgoKREVMRVRFIEZST00gYnJzX3dhdmVfY29udGVudF9oaXN0b3J5OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9jb250ZW50OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9zdW1tYXJ5X2hpc3Rvcnk7CkRFTEVURSBGUk9NIGJyc193YXZlX3N1bW1hcnk7CkRFTEVURSBGUk9NIGJyc19yZXBvcnRfd2F2ZTsKCgo7Cj09PT09PT09PT09PT09IDcKaW1hZ2UgaWQgPSA4YTcwNDc2YjY5MzUzNGY2MDE2OTRkMDcxNjBmMDJlNAoKCmRvYyBpZCA9IDhhNzBhMmQxNjkzMTMzMWUwMTY5NGQwN2M3ZjkwMzc3CiAiZmlsZW5hbWUiOiAiZ2l0aHViLWdpdC1jaGVhdC1zaGVldC5wZGYiLAoKCgpERUxFVEUgRlJPTSBicnNfd2F2ZV9jb250ZW50X2hpc3Rvcnk7CkRFTEVURSBGUk9NIGJyc193YXZlX2NvbnRlbnQ7CkRFTEVURSBGUk9NIGJyc193YXZlX3N1bW1hcnlfaGlzdG9yeTsKREVMRVRFIEZST00gYnJzX3dhdmVfc3VtbWFyeTsKREVMRVRFIEZST00gYnJzX3JlcG9ydF93YXZlOwoKCjsKCgo9PT09PT09PT09PT09PSA4CmltYWdlIGlkID0gOGE3MDQ3NmI2OTM1MzRmNjAxNjk0ZDA3MTYwZjAyZTQKCgpkb2MgaWQgPSA4YTcwYTJkMTY5MzEzMzFlMDE2OTRkMDdjN2Y5MDM3NwogImZpbGVuYW1lIjogImdpdGh1Yi1naXQtY2hlYXQtc2hlZXQucGRmIiwKCgoKREVMRVRFIEZST00gYnJzX3dhdmVfY29udGVudF9oaXN0b3J5OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9jb250ZW50OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9zdW1tYXJ5X2hpc3Rvcnk7CkRFTEVURSBGUk9NIGJyc193YXZlX3N1bW1hcnk7CkRFTEVURSBGUk9NIGJyc19yZXBvcnRfd2F2ZTsKCgo7CgoKPT09PT09PT09PT09PSA5CmltYWdlIGlkID0gOGE3MDQ3NmI2OTM1MzRmNjAxNjk0ZDA3MTYwZjAyZTQKCgpkb2MgaWQgPSA4YTcwYTJkMTY5MzEzMzFlMDE2OTRkMDdjN2Y5MDM3NwogImZpbGVuYW1lIjogImdpdGh1Yi1naXQtY2hlYXQtc2hlZXQucGRmIiwKCgoKREVMRVRFIEZST00gYnJzX3dhdmVfY29udGVudF9oaXN0b3J5OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9jb250ZW50OwpERUxFVEUgRlJPTSBicnNfd2F2ZV9zdW1tYXJ5X2hpc3Rvcnk7CkRFTEVURSBGUk9NIGJyc193YXZlX3N1bW1hcnk7CkRFTEVURSBGUk9NIGJyc19yZXBvcnRfd2F2ZTsKCgo7Cg==";
    SendMessage sendMessage = new SendMessage();
    sendMessage.setTo("yogesh.it2010@gmail.com");
    sendMessage.setFrom("testdomain@domain.com");
    sendMessage.setSubject("Hello how r you");
    sendMessage.setBodyText("BodyText here");
    String Pdf = "application/pdf";
    String textContenttype = "text/plain";
    sendMessage.setAttachmentContentType(textContenttype);
    sendMessage.setAttachmentContent(data);
    sendMessage.setAttachmentFilename("setAttachmentFilename.pdf");
    try {
      kafka.send(topic, sendMessage);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}