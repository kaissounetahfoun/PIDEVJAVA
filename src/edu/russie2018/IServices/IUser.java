/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.russie2018.IServices;

import edu.russie2018.entities.User;
import java.util.List;

/**
 *
 * @author Jawhar
 */
public interface IUser {
    
    public void ajouterUser(User U);
    public void supprimerUser(User U);
    public void modifierUser(User U);
    public List<User> consulterUser();
    
}
