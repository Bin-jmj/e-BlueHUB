import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Species } from '../pages/admin-dashboard/Species';

@Injectable({
  providedIn: 'root'
})
export class SpeciesService {
  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getSpecies(): Observable<Species[]> {
    return this.http.get<Species[]>(`${this.apiServerUrl}/Species/all`);
  }

  public addSpecies(species: Species): Observable<Species[]> {
    return this.http.post<Species[]>(`${this.apiServerUrl}/Species/add`, species);
  }

  public updateSpecies(species: Species): Observable<Species[]> {
    return this.http.put<Species[]>(`${this.apiServerUrl}/Species/update`, species);
  }

  public deleteSpecies(speciesId: Species): Observable<Species[]> {
    return this.http.delete<Species[]>(`${this.apiServerUrl}/Species/del${speciesId}`);
  }
}
