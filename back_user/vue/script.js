// Stockage local simulé
const users = [];

// Récupération des éléments du DOM
const form = document.getElementById("userForm");
const nameInput = document.getElementById("name");
const emailInput = document.getElementById("email");
const passwordInput = document.getElementById("password");
const errorMsg = document.getElementById("formError");
const userTableBody = document.querySelector("#userTable tbody");

// État pour modification
let editingIndex = null;

// Gestion de la soumission du formulaire
form.addEventListener("submit", function (e) {
  e.preventDefault();

  const name = nameInput.value.trim();
  const email = emailInput.value.trim();
  const password = passwordInput.value.trim();

  if (!validateForm(name, email, password)) return;

  const user = { name, email };

  if (editingIndex !== null) {
    users[editingIndex] = user;
    editingIndex = null;
  } else {
    users.push(user);
  }

  form.reset();
  errorMsg.textContent = "";
  renderUserTable();
});

// Validation des champs
function validateForm(name, email, password) {
  if (!name || !email || !password) {
    errorMsg.textContent = "Tous les champs sont obligatoire.";
    return false;
  }

  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailRegex.test(email)) {
    errorMsg.textContent = "Adresse email invalide.";
    return false;
  }

  if (password.length < 6) {
    errorMsg.textContent = "Mot de passe trop court (6 caractères minimum).";
    return false;
  }

  return true;
}

// Affichage du tableau des utilisateurs
function renderUserTable() {
  userTableBody.innerHTML = "";

  users.forEach((user, index) => {
    const row = document.createElement("tr");

    const nameCell = document.createElement("td");
    nameCell.textContent = user.name;

    const emailCell = document.createElement("td");
    emailCell.textContent = user.email;

    const actionCell = document.createElement("td");

    const editBtn = document.createElement("span");
    editBtn.textContent = "Modifier";
    editBtn.classList.add("action-btn");
    editBtn.onclick = () => editUser(index);

    const deleteBtn = document.createElement("span");
    deleteBtn.textContent = "Supprimer";
    deleteBtn.classList.add("action-btn");
    deleteBtn.onclick = () => deleteUser(index);

    actionCell.appendChild(editBtn);
    actionCell.appendChild(deleteBtn);

    row.appendChild(nameCell);
    row.appendChild(emailCell);
    row.appendChild(actionCell);

    userTableBody.appendChild(row);
  });
}

// Supprimer un utilisateur
function deleteUser(index) {
  users.splice(index, 1);
  renderUserTable();
}

// Modifier un utilisateur
function editUser(index) {
  const user = users[index];
  nameInput.value = user.name;
  emailInput.value = user.email;
  passwordInput.value = ""; // Mot de passe remis à zéro
  editingIndex = index;
}
