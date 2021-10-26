import { Injectable } from '@angular/core';
import {HttpClient, HttpResponse} from "@angular/common/http";
import {Observable} from "rxjs";
import {ResearchModel} from "../models/researchModel";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class ResearchService {

  // @ts-ignore
  constructor(private httpClient: HttpClient) { }

  getFrequencies(dto: ResearchModel): Observable<HttpResponse<any>> {
    // @ts-ignore
    return this.httpClient.post<any>(environment.RESEARCH_SERVICE + '/frequency', dto, {observe : 'response'});
  }

  getSimilarWords(dto: ResearchModel): Observable<HttpResponse<any>> {
    return this.httpClient.post<any>(environment.RESEARCH_SERVICE + '/similar-words', dto,{observe : 'response'});
  }
}
