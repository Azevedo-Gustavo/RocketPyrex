import { bancos, categorias } from '../../../utils/mock'
import Button from '../../atoms/Button'
import Input from '../../atoms/Input'
import Select from '../../atoms/Select'

const Receitas = () => {
  return (
    <div className="py-4">
      <span style={{ display: 'flex', gap: '0 1rem' }}>
        <Input type="date" label="Data" placeholder="Data" />
        <Input type="number" label="Valor" placeholder="Valor" />
      </span>
      <Select label="Categoria" placeholder="Categoria">
        {categorias.map(categoria => (
          <option value={categoria.id} key={categoria.id}>
            {categoria.description}
          </option>
        ))}
      </Select>
      <Select label="Bancos" placeholder="Bancos">
        {bancos.map(banco => (
          <option value={banco.id} key={banco.id}>
            {banco.description}
          </option>
        ))}
      </Select>
      <Input label="Observações" placeholder="Observações" />
      <Button>Continuar</Button>
    </div>
  )
}

export default Receitas
