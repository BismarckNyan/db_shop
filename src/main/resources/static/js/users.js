const name= document.getElementsByClassName("role");
for (i=0;i<name.length;i++){
    if (name[i].innerText=='ROLE_USER'){
        name[i].innerText='Роль: Юзер'
    }else if (name[i].innerText=='ROLE_ADMIN'){
        name[i].innerText='Роль: Администратор'
    }}