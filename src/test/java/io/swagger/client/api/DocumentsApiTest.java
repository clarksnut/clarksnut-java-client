package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DocumentRepresentation;
import io.swagger.client.model.MultipartFormDataInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentsApi
 */
@Ignore
public class DocumentsApiTest {

    private final DocumentsApi api = new DocumentsApi();

    
    /**
     * Print Document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadDocumentPdfTest() throws ApiException {
        String documentId = null;
        String theme = null;
        String locale = null;
        String format = null;
        api.downloadDocumentPdf(documentId, theme, locale, format);

        // TODO: test validations
    }
    
    /**
     * Download Document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadDocumentXmlTest() throws ApiException {
        String documentId = null;
        api.downloadDocumentXml(documentId);

        // TODO: test validations
    }
    
    /**
     * Return one Document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTest() throws ApiException {
        String documentId = null;
        DocumentRepresentation response = api.getDocument(documentId);

        // TODO: test validations
    }
    
    /**
     * Import Document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importDocumentTest() throws ApiException {
        MultipartFormDataInput body = null;
        api.importDocument(body);

        // TODO: test validations
    }
    
}
