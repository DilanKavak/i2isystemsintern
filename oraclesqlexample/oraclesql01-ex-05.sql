select LPAD(REGEXP_SUBSTR(ad, '[^ ]+' ,1,1),2) 
    || REGEXP_REPLACE((substr(REGEXP_SUBSTR(name, '[^ ]+' ,1,1),3,length(REGEXP_SUBSTR(name, '[^ ]+' ,1,1)))) ,'.','*' )
    || ' ' || 
    LPAD(REGEXP_SUBSTR(ad, '[^ ]+' ,1,2),2) 
    || REGEXP_REPLACE((substr(REGEXP_SUBSTR(name, '[^ ]+' ,1,2),3,length(REGEXP_SUBSTR(name, '[^ ]+' ,1,2)))) ,'.','*' )
    || ' ' ||
    LPAD(REGEXP_SUBSTR(ad, '[^ ]+' ,1,3),2) 
    || REGEXP_REPLACE((substr(REGEXP_SUBSTR(name, '[^ ]+' ,1,3),3,length(REGEXP_SUBSTR(name, '[^ ]+' ,1,3)))) ,'.','*' )
as ad from HR.customers;