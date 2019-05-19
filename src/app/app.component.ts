import { Component } from '@angular/core';
import {Validators, FormControl, FormBuilder} from '@angular/forms';
import {FormGroup} from '@angular/forms';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'kolicalc-frontend';
  formGroup: FormGroup;

  pont = 0;
  lakhely = 0;
  tanulmanyiAtlag = 0;
  felveteliPont = 0;
  egyForeJovedelem = 0;
  munkanelkuliTestver = 0;
  sajatGyermek = 0;
  szuloktolKulon: boolean;
  szuloktolKulonHazas: boolean;
  arva: boolean;
  felarva: boolean;
  felarvaNevSzul: boolean;
  munkanelkuliEltarto: boolean;
  kozfoglEltarto: boolean;

  distances = [
    {value: 0, text: ''},
    {value: 0, text: '0 - 80 km'},
    {value: 1, text: '81 - 150 km'},
    {value: 2, text: '151 - 250 km'},
    {value: 3, text: '251 - 350 km'},
    {value: 4, text: '351 km-től'}
  ];

  atlagok = [
    {value: 0, text: ''},
    {value: 0, text: '3,00 alatt'},
    {value: 1, text: '3,01 - 3,50'},
    {value: 2, text: '3,51 - 4,00'},
    {value: 3, text: '4,01 - 4,5'},
    {value: 4, text: '4,51 felett'}
  ];

  felveteliPontok = [
    {value: 0, text: ''},
    {value: 2, text: 'bejutási ponthatártól - 350-ig'},
    {value: 3, text: '351 - 400-ig'},
    {value: 4, text: '401 felett'}
  ];

  jovedelemLista = [
    {value: 0, text: ''},
    {value: 8, text: '0 - 30.000 Ft'},
    {value: 7, text: '30.001 - 35.000 Ft'},
    {value: 6, text: '35.001 - 40.000 Ft'},
    {value: 5, text: '40.001 - 45.000 Ft'},
    {value: 4, text: '45.001 - 50.000 Ft'},
    {value: 3, text: '50.001 - 55.000 Ft'},
    {value: 2, text: '55.001 - 60.000 Ft'},
    {value: 1, text: '60.001 - 70.000 Ft'},
    {value: 0, text: '70.000 felett'}
  ];


  constructor(private fb: FormBuilder) {}

  ngOnInit() {
    this.formGroup = this.fb.group({
      lakhely: new FormControl('', Validators.required),
      tanulmanyiAtlag: new FormControl('', Validators.required),
      felveteliPont: new FormControl('', Validators.required),
      egyForeJovedelem: new FormControl('', Validators.required),
      munkanelkuliTestver: new FormControl('', Validators.required),
      sajatGyermek: new FormControl('', Validators.required),
      szuloktolKulon: new FormControl('', Validators.required),
      szuloktolKulonHazas: new FormControl('', Validators.required),
      arva: new FormControl('', Validators.required),
      felarva: new FormControl('', Validators.required),
      felarvaNevSzul: new FormControl('', Validators.required),
      munkanelkuliEltarto: new FormControl('', Validators.required),
      kozfoglEltarto: new FormControl('', Validators.required)
    });
  }

  save() {
    // lekezelni hogy mikor mennyi pont jár a hallgatónak az input mezők értékei és a legördülő mezők értékei után
    this.pont =
      this.lakhely +
      this.tanulmanyiAtlag +
      this.felveteliPont +
      this.egyForeJovedelem +
      (this.szuloktolKulon ? 2 : 0) +
      (this.szuloktolKulonHazas ? 6 : 0) +
      (this.arva ? 10 : 0) +
      (this.felarva ? 7 : 0) +
      (this.felarvaNevSzul ? 4 : 0) +
      (this.munkanelkuliEltarto ? 4 : 0) +
      (this.kozfoglEltarto ? 2 : 0);
  }

}
