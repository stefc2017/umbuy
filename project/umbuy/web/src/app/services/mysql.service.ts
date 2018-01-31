import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import 'rxjs/add/operator/delay';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/do';
import { Advertisement } from '../api/advertisement';

@Injectable()
export class MysqlService{

    constructor(public http: HttpClient){
    }

    private url:string;

    getAllAdvertisements(){
        this.url = "http://localhost:3000/getAllAdvertisements";
        return this.http.get<Advertisement[]>(this.url);
    }
}
