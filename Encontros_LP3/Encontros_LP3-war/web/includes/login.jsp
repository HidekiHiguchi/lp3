
        <script type="text/JavaScript" src="<?php echo $siteURL?>/scripts/forms.js"></script>

         <form action='Controller' method='post' name='login_form'>
            Username:<br><input type='text' name='username' /><br>
            Password:<br><input type='password'
                             name='password'
                             id='password'/><br>
            <input id="action" name="action" type="hidden" value="login"/>
            <input type='submit'
                   value='Login'
                   onclick='formhash(this.form, this.form.password)'; />
                   <input type='submit' style='display: none'
                   onclick='formhash(this.form, this.form.password)'; />
          </form><br>
          
