// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceDeleteExternalRefundRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.delete_external_refund","Description":"Deletes an external refund, by invoice ID and transaction ID.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice from which to delete the refund transaction.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"},{"Type":"string","VariableName":"transaction_id","Description":"The ID of the refund transaction to delete.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"DELETE","Path":"/v1/invoicing/invoices/{invoice_id}/refund-records/{transaction_id}","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Deletes an external refund, by invoice ID and transaction ID.
 */
public class InvoiceDeleteExternalRefundRequest extends HttpRequest<Void> {

    public InvoiceDeleteExternalRefundRequest(String invoiceId, String transactionId) {
        super("/v1/invoicing/invoices/{invoice_id}/refund-records/{transaction_id}?"
            .replace("{invoice_id}", String.valueOf(invoiceId))
            .replace("{transaction_id}", String.valueOf(transactionId)), "DELETE", Void.class);
    }
}
