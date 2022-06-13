export async function buscarTodasDicas() {
  const res = await fetch('https://api-caminho-certo.tarleylana.repl.co/api/dicas')
  return res.json()
}

export async function buscarPorId(id) {
  const res = await fetch('https://api-caminho-certo.tarleylana.repl.co/api/dicas/' + id)
  return res.json()
}

export async function salvarDica(dica) {
  const res = await fetch('https://api-caminho-certo.tarleylana.repl.co/api/dicas', {
    method: 'POST',
    body: JSON.stringify(dica)
  })

  return res.json()
}