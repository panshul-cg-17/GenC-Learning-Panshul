import { Component } from '@angular/core';
import { Appointments } from '../models/appointments';
import {OnInit} from '@angular/core'
@Component({
  selector: 'app-appointment-list',
  standalone: false,
  templateUrl: './appointment-list.html',
  styleUrl: './appointment-list.css'
})
export class AppointmentList implements OnInit{
  
  appointments:Appointments [] = [] ; 

  ngOnInit(): void {
      let savedAppointment = localStorage.getItem('applicantData');
      this.appointments = savedAppointment ? JSON.parse(savedAppointment) : [] ; 
  }

  // variables
  name:string = "";
  date:Date = new Date();


  // add functionality
  addAppointment(){
     let appoint: Appointments = {
      name : this.name,
      date: this.date,
      id: Date.now()
     } 

     this.appointments.push(appoint);

     this.name = "";
     this.date = new Date() ;
     localStorage.setItem("applicantData", JSON.stringify(this.appointments));
  }
  
  // creating a remove functionality

  deleteAppointment(index: number){
    this.appointments.splice(index,1);
    localStorage.setItem("applicantData", JSON.stringify(this.appointments));
  }
}
