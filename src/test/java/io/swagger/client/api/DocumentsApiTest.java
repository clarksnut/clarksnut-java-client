package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DocumentQueryRepresentation;
import io.swagger.client.model.DocumentRepresentation;
import io.swagger.client.model.GenericDataRepresentationListDocumentData;
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
     * Get Document
     *
     * This will return a document
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
     * Get Documents
     *
     * This will search just on Owned and Collaborated Spaces
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentsTest() throws ApiException {
        String q = null;
        Integer offset = null;
        Integer limit = null;
        List<String> space = null;
        GenericDataRepresentationListDocumentData response = api.getDocuments(q, offset, limit, space);

        // TODO: test validations
    }
    
    /**
     * Download Document
     *
     * This will download the document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXmlTest() throws ApiException {
        String documentId = null;
        api.getXml(documentId);

        // TODO: test validations
    }
    
    /**
     * Import Document
     *
     * This will import xml or compressed files
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
    
    /**
     * Print Document
     *
     * This will print the document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void printDocumentTest() throws ApiException {
        String documentId = null;
        String theme = null;
        String format = null;
        api.printDocument(documentId, theme, format);

        // TODO: test validations
    }
    
    /**
     * Search Document
     *
     * This will search document in advanced mode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchDocumentsTest() throws ApiException {
        DocumentQueryRepresentation body = null;
        GenericDataRepresentationListDocumentData response = api.searchDocuments(body);

        // TODO: test validations
    }
    
    /**
     * Update Document
     *
     * This will update the document just for current user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDocumentTest() throws ApiException {
        String documentId = null;
        DocumentRepresentation body = null;
        DocumentRepresentation response = api.updateDocument(documentId, body);

        // TODO: test validations
    }
    
}
