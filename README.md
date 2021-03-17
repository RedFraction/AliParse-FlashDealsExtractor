# FlashDealsExtractor
Extract Ali flash deals to csv

## Results with 20 item per request:
	100  items = AVG ( ~ 2650 ms  );
	200  items = AVG ( ~ 4250 ms  );
	500  items = AVG ( ~ 9050 ms  );
	1000 items = AVG ( ~ 16800 ms );
	
## 
| Parametrs | Description |
| --------- | ----------- |
| --offersLimit=%        | Set how much offers need to load, by default 100 |
| --per-request=%        | Set how much offers get per request ( don't use more than 20-30 - ali wouldn't get too much items per request ), by default 20 |
| --wo-header            | Do not draw table header, by default header will be drawn |
