import { Component, OnInit, ViewChild } from '@angular/core';
import { MatInput } from '@angular/material/input';
import { FieldType } from '@ngx-formly/material/form-field';

@Component({
  // tslint:disable-next-line:component-selector
  selector: 'formly-field-mat-input',
  template: `
    <input *ngIf="type !== 'number'; else numberTmp"
      matInput
      spellcheck="false"
      [name]="to.title"
      [id]="id"
      [readonly]="to.readonly"
      [type]="type || 'text'"
      [errorStateMatcher]="errorStateMatcher"
      [formControl]="formControl"
      [formlyAttributes]="field"
      [tabindex]="to.tabindex || 0"
      [placeholder]="to.placeholder">
    <ng-template #numberTmp>
      <input matInput
             spellcheck="false"
             [id]="id"
             type="number"
             [readonly]="to.readonly"
             [errorStateMatcher]="errorStateMatcher"
             [formControl]="formControl"
             [formlyAttributes]="field"
             [tabindex]="to.tabindex || 0"
             [placeholder]="to.placeholder">
    </ng-template>
  `,
})
export class InputTypeComponent extends FieldType implements OnInit {
  @ViewChild(MatInput, { static: true }) formFieldControl!: MatInput;

  get type() {
    return this.to.type || 'text';
  }
}