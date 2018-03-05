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
     * Print Document
     *
     * User need to have access to the Space owner of the document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadPdfTest() throws ApiException {
        String documentId = null;
        String theme = null;
        String format = null;
        api.downloadPdf(documentId, theme, format);

        // TODO: test validations
    }
    
    /**
     * Download Document
     *
     * User need to have access to the Space owner of the document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadXmlTest() throws ApiException {
        String documentId = null;
        api.downloadXml(documentId);

        // TODO: test validations
    }
    
    /**
     * Return one Document
     *
     * User need to have access to the Space owner of the document
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
     * Return List of Documents
     *
     * Search on allowed user (session) spaces
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentsTest() throws ApiException {
        String filterText = null;
        Integer offset = null;
        Integer limit = null;
        List<String> space = null;
        GenericDataRepresentationListDocumentData response = api.getDocuments(filterText, offset, limit, space);

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
     * Search Document
     *
     * Search on allowed user (session) spaces
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
     * Update a Document
     *
     * User need to have access to the Space owner of the document
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
