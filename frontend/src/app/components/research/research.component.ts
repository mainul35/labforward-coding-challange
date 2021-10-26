import { Component, OnInit } from '@angular/core';
import {ResearchService} from "../../services/research.service";
import {ResearchModel} from "../../models/researchModel";

@Component({
  selector: 'app-research-frequency',
  templateUrl: './research.component.html',
  styleUrls: ['./research.component.css']
})
export class ResearchComponent implements OnInit {
  givenWord ?: string;
  notebookEntries ?: string;
  frequencies: number = 0;
  similarWords = [];

  constructor(private researchService: ResearchService) { }

  ngOnInit(): void {
  }

  viewFrequencies() {
    const dto = new ResearchModel();
    dto.notebookEntry = this.notebookEntries;
    dto.givenWord = this.givenWord;
    this.researchService.getFrequencies(dto).subscribe(value => {
      this.frequencies = value.body?.frequency;
    }, error => {
      console.log(error)
      alert("Failed to process your data. Please check your form")
    })
  }

  viewSimilarWords() {
    const dto = new ResearchModel();
    dto.notebookEntry = this.notebookEntries;
    dto.givenWord = this.givenWord;
    this.researchService.getSimilarWords(dto).subscribe(value => {
      this.similarWords = value.body.similarWords
    }, error => {
      console.log(error)
      alert("Failed to process your data. Please check your form")
    })
  }
}
