package com.client.oauth.service;

import com.client.oauth.domain.Patient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/**
 * Created by sabin on 8/7/2017.
 */
public interface HttpService {

    JSONObject getToken(String authCode) throws IOException, JSONException;

    List<Patient> getResource(String token) throws IOException, JSONException;

    List<Patient> responseParser(CloseableHttpResponse response) throws IOException, JSONException;

    String getPublicInfo() throws IOException;
}
