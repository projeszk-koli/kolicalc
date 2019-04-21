import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'kolicalc-frontend';

  testverek: number[];

  constructor(){
    this.testverek = new Array();
  }

  testverHozzaadas(): void{
    this.testverek.push(1);
  }

}
