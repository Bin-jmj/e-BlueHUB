import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { SpeciesService } from 'src/app/Services/species.service';
import { Species } from './Species';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {
  public species!: Species[];

  constructor(private speciesService: SpeciesService) {}
  
  ngOnInit() {
    this.getSpecies();
  }
  

  public getSpecies(): void {
    this.speciesService.getSpecies().subscribe(
      (response: Species[]) => {
        this.species = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }


  public onAddSpecies(addForm: NgForm):void {
    this.speciesService.addSpecies(addForm.value).subscribe(
      (response: Species[]) =>{
        console.log(response);
        this.getSpecies();
      },
      (error: HttpErrorResponse) =>{
        alert(error.message);
      }
    );
    
  }

  public onOpenModal(species:Species, mode: string): void {
    const container:any = document.getElementById('main-container');
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle','modal');
    if(mode === 'add') {
      button.setAttribute('data-target','#addSpeciesModal');
    }
    if(mode === 'edit') {
      button.setAttribute('data-target','#updateSpeciesModal');
    }
    if(mode === 'delete') {
      button.setAttribute('data-target','#deleteSpeciesModal');
    }

    container.appendChild(button);
    button.click();
  }



}
